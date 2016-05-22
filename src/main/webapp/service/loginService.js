app.factory('loginService', function ($http) {

    factory.getLoginDetails = function (userName, password) {
        return $http({
            method: "get",
            url: "/login/",
            params: {
                userName: userName,
                password:password
            }
        });
    };
});