
var demoApp = angular.module('demoApp', ['ngRoute', 'ngResource']);

demoApp.factory('simpleFactory', function ($resource) {
    return $resource('/api/fu/user');
});

demoApp.controller('SimpleController', function ($scope, simpleFactory) {
    $scope.customers = simpleFactory.query();

    $scope.addCustomer = function () {
        simpleFactory.save($scope.newCustomer, function(resource) {
            $scope.customers.push($scope.newCustomer);
            $scope.newCustomer = {};

        }, function(response){
            console.log('Error ' + response.status);
        });
    };
});

demoApp.config(function ($routeProvider) {
    $routeProvider
        .when('/view1', {
            controller: 'SimpleController',
            templateUrl: '/resources/templates/partials/view1.html'
        })
        .when('/view2', {
            controller: 'SimpleController',
            templateUrl: '/resources/templates/partials/view2.html'
        })
        .otherwise({redirectTo: '/view1'});
});