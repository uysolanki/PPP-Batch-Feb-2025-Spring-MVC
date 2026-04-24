<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2 class="text-center my-4">Player List</h2>

<div class="container">
    <div class="row g-4">
        <c:forEach var="player" items="${players}">
            <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                <div class="card h-100 shadow-sm border-0">
                    
                    <img src="${player.image}" 
                         class="card-img-top img-fluid"
                         style="height: 220px; object-fit: cover;" 
                         alt="${player.pname}">
                    
                    <div class="card-body d-flex flex-column">
                        <h5 class="card-title">${player.pname}</h5>
                        <p class="card-text text-muted">${player.info}</p>

                        <a href="#" class="btn btn-primary mt-auto w-100">
                            View Profile
                        </a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>