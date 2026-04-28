<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Player</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background: linear-gradient(to right,#0f2027,#203a43,#2c5364);
    min-height:100vh;
}

.card{
    border:none;
    border-radius:18px;
}

.form-control{
    border-radius:10px;
}

.btn-custom{
    border-radius:10px;
    font-weight:600;
}
</style>

</head>
<body>

<div class="container mt-5">

    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow-lg p-4">

                <h2 class="text-center text-primary mb-4">
                    Add New Player
                </h2>

                <form:form action="savePlayer" method="post" modelAttribute="player">

                    <!-- Player Name -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">Player Name</label>
                        <form:input path="pname" class="form-control" placeholder="Enter player name"/>
                    </div>

                    <!-- Player Info -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">Player Info</label>
                        <form:textarea path="info" class="form-control" rows="4"
                        placeholder="Enter player details"/>
                    </div>

                    <!-- Player Image -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">Image URL</label>
                        <form:input path="image" class="form-control"
                        placeholder="Paste image link"/>
                    </div>

                    <!-- Buttons -->
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-success btn-custom">
                            Save Player
                        </button>

                        <button type="reset" class="btn btn-outline-secondary btn-custom">
                            Reset
                        </button>
                    </div>

                </form:form>

            </div>

        </div>
    </div>

</div>

</body>
</html>