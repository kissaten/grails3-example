environments {
  production {
    dataSource {
      dbCreate = "update"
      driverClassName = "org.postgresql.Driver"
      dialect = org.hibernate.dialect.PostgreSQLDialect
      uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
      url = "jdbc:postgresql://" + uri.host + ":" + uri.port + uri.path + "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
      username = uri.userInfo.split(":")[0]
      password = uri.userInfo.split(":")[1]
    }
  }
}
