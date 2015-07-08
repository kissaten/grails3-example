# Grails 3 on Heroku Example

```
$ git clone <this repo>
$ heroku create
$ heroku addons:create heroku-postgresql
$ git push heroku master
```

NOTE: You may find that this app fails to start up with in the 60 second
boot timeout limit imposed by Heroku. If that's the case, please contact
[Heroku Support](http://help.heroku.com).
