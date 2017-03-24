# cordova-launch-social-apps
Cordova plugin to launch links to social apps like facebook or twitter

# Installation 

```bash
  cordova plugin add https://github.com/MobileAccord/cordova-launch-social-apps.git --save
```

# Usage

```javascript
  
  var twitter = {id: "567609666", url:"GeoPoll"};
  
  var success = function(success){
    console.log("success :: " + success);
  };

  var error = function(error){
    console.log("error :: " + error);
  };

  SocialAppsLauncher.launchTwitter(twitter, success, error);

```
