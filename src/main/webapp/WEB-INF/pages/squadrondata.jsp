<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Flying Base 2</title>
    <!-- BOOTSTRAP STYLES-->
    <link rel="stylesheet" type="text/css" href="<spring:url value='/resources/assets/css/bootstrap.css'/>" />
    <!-- FONTAWESOME STYLES-->
    <link rel="stylesheet" type="text/css" href="<spring:url value='/resources/assets/css/font-awesome.css'/>" />
    <!-- TABLE STYLES-->
    <link rel="stylesheet" type="text/css" href="<spring:url value='/resources/assets/js/dataTables/dataTables.bootstrap.css'/>" />
    <!-- CUSTOM STYLES-->
    <link rel="stylesheet" type="text/css" href="<spring:url value='/resources/assets/css/custom.css'/>" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">Flying Base 2</a>
        </div>
        <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> Добро пожаловать e.shamkin &nbsp; <a href="#" class="btn btn-danger square-btn-adjust">Выйти</a> </div>
    </nav>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li class="text-center">
                    <img src="<spring:url value='/resources/assets/img/newfb28.png'/>" class="user-image img-responsive"/>
                </li>
                <li>
                    <a class="active-menu"  href="index.html"><i class="fa fa-table fa-3x"></i>  События</a>
                </li>
                <li>
                    <a href="ui.html"><i class="fa fa-edit fa-3x"></i> Сообщения</a>
                </li>
                <li>
                    <a href="tab-panel.html"><i class="fa fa-sitemap fa-3x">
                    </i> Настройки</a>
                </li>
                <li>
                    <a href="chart.html"><i class="fa fa-bar-chart-o fa-3x"></i> Статистика</a>
                </li>
            </ul>
        </div>
    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h2>Летные события</h2>
                    <h5>Уровень доступа: командир авиаэскадрильи</h5>
                </div>
            </div>
            <!-- /. ROW  -->
            <hr/>
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Перечень событий
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <c:if test="${!empty listAviasquadronData}">
                                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Вх. №</th>
                                            <th>Дата полета</th>
                                            <th>№ рейса</th>
                                            <th>Взлет</th>
                                            <th>Посадка</th>
                                            <th>Бортовой номер</th>
                                            <th>КВС ID</th>
                                            <th>ВП ID</th>
                                            <th>Исходный риск</th>
                                            <th>Срок КД</th>
                                            <th>КД одобрены</th>
                                            <th>Индекс риска</th>
                                            <th>Закрыт</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${listAviasquadronData}" var="data">
                                            <tr class="gradeA">  <!-- HARDCODE !!! --->
                                                <td>${data.id}</td>
                                                <td><a href="/sqinfo/${data.id}" target="_blank">${data.incomingNumber}</a></td>
                                                <td>${data.dateOfFlight}</td>
                                                <td>${data.flightNumber}</td>
                                                <td>${data.departure}</td>
                                                <td>${data.arrival}</td>
                                                <td>${data.tailNumber}</td>
                                                <td>${data.pilotInCommand}</td>
                                                <td>${data.firstAssistant}</td>
                                                <td>${data.incomingRisk}</td>
                                                <td>${data.deadlineOfCorrectiveAction}</td>
                                                <td>${data.correctiveActionAcceptanceBy}</td>
                                                <td>${data.riskIndex}</td>
                                                <td>${data.talonClosedBy}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </c:if>
                            </div>
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
        </div>
        <!-- /. ROW  -->
    </div>
    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
<!-- SCRIPTS - AT THE BOTTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/jquery-1.10.2.js'/>"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/bootstrap.min.js'/>"></script>
<!-- METISMENU SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/jquery.metisMenu.js'/>"></script>
<!-- DATA TABLE SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/dataTables/jquery.dataTables.js'/>"></script>
<script type="text/javascript" src="<spring:url value='/resources/assets/js/dataTables/dataTables.bootstrap.js'/>"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>
<!-- CUSTOM SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/custom.js'/>"></script>

</body>
</html>
