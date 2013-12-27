
var demoApp = angular.module('demoApp', []);

var controllers = {};

controllers.SimpleController = function ($scope) {
    $scope.customers = [
        {name:'Soham', city:'Bangalore'},
        {name:'John Doe', city:'Delhi'},
        {name:'Jane Doe', city:'Calcutta'}
    ];
};

demoApp.controller(controllers);