<html>
<head>
    <title>AngularJS Test</title>
    <@resource.javascript  file="/plugins/TestWebservice/resources/script/ngcontrollers.js"/>
</head>

<body>

<div ng-app="demoApp">

    <div ng-controller="SimpleController">
        Name: <input type="text" ng-model="name"/>
        <br/>

        <ul>
            <li ng-repeat="cust in customers | filter:name | orderBy:'city'">
                {{cust.name | uppercase}} - {{cust.city | lowercase}}
            </li>
        </ul>

    </div>
</div>

</body>
</html>