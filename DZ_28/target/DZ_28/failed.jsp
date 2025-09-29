<html>
<title>Pass-form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<head>
    <style>
        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }

        .alert-container {
            width: 100%;
            position: fixed;
            top: 0;
            z-index: 1000;
        }

        .centered-form {
            background: white;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 100%;
            max-width: 300px;
            margin: auto; /* Центрирование по вертикали */
            position: relative;
        }

        .form-vertical {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 15px;
        }

        /* Поле только для чтения */
        .form-control-plaintext {
            display: block;
            padding: 8px 12px;
            font-size: 14px;
            color: #333;
            background-color: #f8f9fa;
            border: 1px solid #ddd;
            border-radius: 4px;
            width: 100%;
        }

        /* Обычное поле ввода */
        .form-control {
            display: block;
            padding: 8px 12px;
            font-size: 14px;
            color: #333;
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 4px;
            width: 100%;
            transition: border-color 0.3s;
        }

        .form-control:focus {
            outline: none;
            border-color: #007bff;
            box-shadow: 0 0 0 2px rgba(0, 123, 255, 0.25);
        }

        /* Кнопка */
        .btn {
            padding: 8px 16px;
            font-size: 14px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
            width: 100%;
        }

        .btn-primary {
            background-color: #45a049;
            color: white;
        }

        .btn-primary:hover {
            background-color: #187d1c;
        }

    </style>
</head>
<body>
<div class="alert-container">
    <div class="alert alert-danger alert-dismissible fade show mb-0" role="alert">
        Incorrect input, please try again!
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
</div>

<div class="centered-form">
    <form class="form-vertical" action="save-request" method="post">
        <div class="w-100">
            <label for="staticEmail2" class="form-label">Email</label>
            <input type="email" class="form-control-plaintext" id="staticEmail2" name="email"
                   placeholder="email@example.com" required>
        </div>
        <div class="w-100">
            <label for="inputPassword2" class="form-label">Password</label>
            <input type="password" class="form-control" id="inputPassword2" name="password"
                   placeholder="Password" required>
        </div>
        <div class="w-100">
            <button type="submit" class="btn btn-primary">Confirm identity</button>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>