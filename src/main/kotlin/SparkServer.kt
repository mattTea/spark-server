import spark.kotlin.*

fun main(args:Array<String>) {
    val http: Http = ignite()

    http.get("/hello") {
        "Hello Spark Kotlin!"
    }

    http.get("/lists") {
        "This is the route for GET /lists"
    }
}

// visit http://localhost:4567/hello