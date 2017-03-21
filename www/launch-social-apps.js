var exec = require('cordova/exec');

window.SocialAppsLauncher = {
    launchFaceBook: function(params, success, error) {
      	console.log("launchFaceBook() :: id => " + params.id + " url => " + params.url);
	  	var args = [params.id, params.url];
    	exec(success, error, "SocialAppsLauncher", "launchFaceBook", args);
    },
    
	launchTwitter: function(params, success, error) {
		console.log("launchTwitter() :: id => " + params.id + " url => " + params.url);
		var args = [params.id, params.url];
    	exec(success, error, "SocialAppsLauncher", "launchTwitter", args);
	}
};