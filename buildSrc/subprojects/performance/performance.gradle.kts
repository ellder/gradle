apply { plugin("org.gradle.kotlin.kotlin-dsl") }

dependencies {
    compile(project(":testing"))
    compile(project(":build"))
    implementation("org.codehaus.groovy.modules.http-builder:http-builder:0.7.2") {
        // Xerces on the runtime classpath is breaking some of our doc tasks
        exclude(group = "xerces")
    }
}
