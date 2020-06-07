## honeycomb-demo
This is the repo for the blog post [Hands on Monitoring a Spring Boot Application with Honeycomb](https://paika.tech/blog/2020/06/06/hands-on-honeycomb-and-spring-boot.html).
It's Spring Boot app, that exposes an endpoint for persisting Bees to a local H2 database with Spring Data Rest.
Its instrumented with Honeycomb.

### How to run on Mac/Linux
1.  Setup a [Honeycomb Account](https://www.honeycomb.io/pricing/)
1.  Install Java 11 on your computer (I use [jenv](https://www.jenv.be/) for managing java versions)
1.  Clone the repository: `https://github.com/cpaika/honeycomb-demo.git`
1.  Substitute your Honeycomb API key [here](https://github.com/cpaika/honeycomb-demo/blob/master/src/main/resources/application.properties#L8)
1.  Run `mvn spring-boot:run`

### How to run the performance tests
1.  [Install Artillery](https://artillery.io/docs/getting-started/#install-artillery)
1.  Make sure the Spring Boot app is running
1.  `cd artillery`
1.  `artillery run bee-test.yml`

**Persisting a Bee:**

`curl -X POST -H "Content-Type:application/json" -d '{  "name" : "Buzzy", "catchphrase":"Well look at that flower!"}' http://localhost:8080/bees`

**Get a list of all Bees:**

`curl localhost:8080/bees`

