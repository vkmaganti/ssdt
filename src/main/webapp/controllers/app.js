//app.js
var app = angular.module('app', ['ngRoute']);

app.config(['$routeProvider', function ($routeProvider) {

    $routeProvider
        .when('/home', {
            templateUrl: 'partials/partial-home.html',
            controller: 'homeCtrl',
            activeTab: 'home'
        })
        .when('/services', {
            templateUrl: 'partials/partial-services.html',
            controller: 'servicesCtrl',
            activeTab: 'services'
        })
        .when('/about', {
            templateUrl: 'partials/partial-about.html',
            controller: 'aboutCtrl',
            activeTab: 'about'
        })
        .when('/contact', {
            templateUrl: 'partials/partial-contact.html',
            controller: 'contactCtrl',
            activeTab: 'contact'
        })
        .when('/login', {
            templateUrl: 'partials/partial-login.html',
            controller: 'loginCtrl',
            activeTab: 'login'
        }).
        otherwise({
            redirectTo: '/home'
        });
}]);

app.controller('navCtrl', function ($scope, $route) {
    //we set $route to  we have access to it in the HTML
    $scope.$route = $route;
});

app.controller('homeCtrl', function ($scope, $route) {
    $scope.$route = $route;
    $scope.activeTab = $route.current.activeTab;
    $scope.message = 'This is Home screen';

});

app.controller('servicesCtrl', function ($scope, $route) {
    $scope.$route = $route;
    $scope.message = 'This is services screen';

});

app.controller('contactCtrl', function ($scope, $route) {
    $scope.$route = $route;
    $scope.message = 'This is services screen';

});

app.controller('aboutCtrl', function ($scope, $route) {
    $scope.$route = $route;
    $scope.active = 'about';
    $scope.message = 'This is about screen';

});