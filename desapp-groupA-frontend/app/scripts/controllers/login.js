'use strict';

/**
 * @ngdoc function
 * @name desappGroupABackendApp.controller:AboLoginCtrlutCtrl
 * @description
 * # LoginCtrl
 * Controller of the desappGroupABackendApp
 */
angular.module('desappGroupABackendApp')
    .controller('LoginCtrl', function($scope) {
        $scope.$on('event:google-plus-signin-success', function(event, authResult) {
            console.log(authResult);
            // Send login to server or save into cookie
        });
    });
