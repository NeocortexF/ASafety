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
    <title>Flying Base 2: Airsquadron</title>
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
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            Талон обратной связи № ${aviasquadronSingleData.incomingNumber}
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                    <table class="table table-bordered">
                                        <thead>
                                        <tr>
                                            <th>Дата полета</th>
                                            <th>Рейс</th>
                                            <th>Вылет</th>
                                            <th>Прибытие</th>
                                            <th>Борт. номер</th>
                                            <th>КВС ID</th>
                                            <th>ВП ID</th>
                                            <th>PF</th>
                                            <th>Необходимые мероприятия</th>
                                            <th>Срок КД</th>
                                            <th>КД одобрены</th>
                                            <th>Закрыт</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="gradeA">  <!-- HARDCODE !!! --->
                                                <td>${aviasquadronSingleData.dateOfFlight}</td>
                                                <td>${aviasquadronSingleData.flightNumber}</td>
                                                <td>${aviasquadronSingleData.departure}</td>
                                                <td>${aviasquadronSingleData.arrival}</td>
                                                <td>${aviasquadronSingleData.tailNumber}</td>
                                                <td>${aviasquadronSingleData.pilotInCommand}</td>
                                                <td>${aviasquadronSingleData.firstAssistant}</td>
                                                <td>${aviasquadronSingleData.pilotFlying}</td>
                                                <td>${aviasquadronSingleData.necessaryActions}</td>
                                                <td>${aviasquadronSingleData.deadlineOfCorrectiveAction}</td>
                                                <td>${aviasquadronSingleData.correctiveActionAcceptanceBy}</td>
                                                <td>${aviasquadronSingleData.talonClosedBy}</td>
                                            </tr>
                                        </tbody>
                                    </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>Событие 1</th>
                                        <th>Классификация события</th>
                                        <th>Предварительная оценка риска</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">  <!-- HARDCODE !!! --->
                                        <td>${aviasquadronSingleData.eventOne}</td>
                                        <td>${aviasquadronSingleData.eventOneClassification}</td>
                                        <td>${aviasquadronSingleData.eventOneForwardRiskEstimate}</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>Событие 2</th>
                                        <th>Классификация события</th>
                                        <th>Предварительная оценка риска</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">  <!-- HARDCODE !!! --->
                                        <td>${aviasquadronSingleData.eventTwo}</td>
                                        <td>${aviasquadronSingleData.eventTwoClassification}</td>
                                        <td>${aviasquadronSingleData.eventTwoForwardRiskEstimate}</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>Событие 3</th>
                                        <th>Классификация события</th>
                                        <th>Предварительная оценка риска</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">  <!-- HARDCODE !!! --->
                                        <td>${aviasquadronSingleData.eventThree}</td>
                                        <td>${aviasquadronSingleData.eventThreeClassification}</td>
                                        <td>${aviasquadronSingleData.eventThreeForwardRiskEstimate}</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>Событие 4</th>
                                        <th>Классификация события</th>
                                        <th>Предварительная оценка риска</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">  <!-- HARDCODE !!! --->
                                        <td>${aviasquadronSingleData.eventFour}</td>
                                        <td>${aviasquadronSingleData.eventFourClassification}</td>
                                        <td>${aviasquadronSingleData.eventFourForwardRiskEstimate}</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Примечания</th>
                                        <th>Обратная связь из летного отряда</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">
                                        <td>${aviasquadronSingleData.remarks}</td>
                                        <td>${aviasquadronSingleData.feedbackFromFlightDepartment}</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <hr/>
        </div>
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
<!-- CUSTOM SCRIPTS -->
<script type="text/javascript" src="<spring:url value='/resources/assets/js/custom.js'/>"></script>

</body>
</html>
