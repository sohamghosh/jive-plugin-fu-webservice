var demoApp = angular.module('demoApp', ['ngRoute']);

demoApp.config(function ($routeProvider) {
    $routeProvider
        .when('/view1', {
            controller:'SimpleController',
            templateUrl:'/resources/templates/partials/view1.html'
        })
        .when('/view2', {
            controller:'SimpleController',
            templateUrl:'/resources/templates/partials/view2.html'
        })
        .otherwise({redirectTo: '/view1'});
});

var controllers = {};

controllers.SimpleController = function ($scope) {
    $scope.customers = [
        {name: 'Soham', city: 'Bangalore'},
        {name: 'John Doe', city: 'Delhi'},
        {name: 'Jane Doe', city: 'Calcutta'}
    ];

    $scope.addCustomer = function() {
        $scope.customers.push({
            name: $scope.newCustomer.name,
            city: $scope.newCustomer.city
        });
    };
};

demoApp.controller(controllers);