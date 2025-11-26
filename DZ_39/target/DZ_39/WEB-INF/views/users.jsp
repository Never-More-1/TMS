<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="springApp.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
    <title>Список пользователей</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .no-users {
            text-align: center;
            color: #666;
            font-style: italic;
            margin: 20px 0;
        }
    </style>
</head>
<body>
<h1>Список пользователей</h1>

<%
    List<User> users = (List<User>) request.getAttribute("usersKey");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
%>

<% if (users == null || users.isEmpty()) { %>
<div class="no-users">Пользователи не найдены</div>
<% } else { %>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Имя пользователя</th>
        <th>Возраст</th>
        <th>Дата создания</th>
        <th>Дата изменения</th>
    </tr>
    </thead>
    <tbody>
    <% for (User user : users) { %>
    <tr>
        <td><%= user.getId() %></td>
        <td><%= user.getName() != null ? user.getName() : "" %></td>
        <td><%= user.getAge() != 0 ? user.getAge() : "" %></td>
        <td>
            <% if (user.getCreated() != null) { %>
            <%= user.getCreated().format(formatter) %>

            <% } else { %>
            -
            <% } %>
        </td>
        <td>
            <% if (user.getUpdated() != null) { %>
            <%= user.getUpdated().format(formatter) %>
            <% } else { %>
            -
            <% } %>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>

<div>Всего пользователей: <%= users.size() %></div>
<% } %>
</body>
</html>