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
    <title>Aviation Safety Solution</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="<c:url value="/resources/assets/css/bootstrap.css" />" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="<c:url value="/resources/assets/css/font-awesome.css" />" rel="stylesheet" />
    <!-- TABLE STYLES-->
    <link href="<c:url value="/resources/assets/js/dataTables/dataTables.bootstrap.css" />" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="<c:url value="/resources/assets/css/custom.css" />" rel="stylesheet" />
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
            <a class="navbar-brand" href="index.html">Aviation Safety Solution</a>
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
                    <img src="assets/img/newfb28.png" class="user-image img-responsive"/>
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
                    <a  href="chart.html"><i class="fa fa-bar-chart-o fa-3x"></i> Статистика</a>
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
                    <h5>Уровень доступа: инженер ЛО</h5>
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
                                <c:if test="${!empty listFlightDepartmentData}">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Вх. №</th>
                                            <th>Дата полета</th>
                                            <th>№ рейса</th>
                                            <th>Взлет</th>
                                            <th>Посадка</th>
                                            <th>Борт</th>
                                            <th>Event</th>
                                            <th>КВС</th>
                                            <th>ВП</th>
                                            <th>PF</th>
                                            <th>АЕ</th>
                                            <th>КД</th>
                                            <th>Индекс риска</th>
                                            <th>Закрыт</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${listFlightDepartmentData}" var="data">
                                        <tr class="gradeA">  <!-- HARDCODE !!! --->
                                            <td>${data.id}</td>
                                            <td><a href="/fdinfo/${data.id}" target="_blank">${data.incomingNumber}</a></td>
                                            <td>${data.dateOfFlight}</td>
                                            <td>${data.flightNumber}</td>
                                            <td>${data.departure}</td>
                                            <td>${data.arrival}</td>
                                            <td>${data.tailNumber}</td>
                                            <td>${data.mainEventNumber}</td>
                                            <td>${data.pilotInCommand}</td>
                                            <td>${data.firstAssistant}</td>
                                            <td>${data.pilotFlying}</td>
                                            <td>${data.aviaEsquadron}</td>
                                            <td>${data.correctiveActionAcceptanceBy}</td>
                                            <td>${data.riskIndex}</td>
                                            <td>${data.talonClosedBy}</td>
                                        <!--    <td><a href="<c:url value='/eventedit/${data.id}'/>">Edit</a></td> -->
                                        <!--    <td><f href="<c:url value='/eventremove/${data.id}'/>">Delete</f></td> -->
                                        </tr>
                                    </tbody>
                                    </c:forEach>
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
<script src="<c:url value="/resources/assets/js/jquery-1.10.2.js" />"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="<c:url value="/resources/assets/js/bootstrap.min.js" />"></script>
<!-- METISMENU SCRIPTS -->
<script src="<c:url value="/resources/assets/js/jquery.metisMenu.js" />"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="<c:url value="/resources/assets/js/dataTables/jquery.dataTables.js" />"></script>
<script src="<c:url value="/resources/assets/js/dataTables/dataTables.bootstrap.js" />"></script>

<!-- Что это за хуйня?! -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>

<!-- CUSTOM SCRIPTS -->
<script src="<c:url value="/resources/assets/js/custom.js" />"></script>

</body>
</html>
