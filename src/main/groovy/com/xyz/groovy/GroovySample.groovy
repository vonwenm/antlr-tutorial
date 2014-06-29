package com.xyz.groovy


class GroovySample  {
    def "go to local"() {
        when:
        go "http://localhost:8080"

        then:
        title == "title!"
    }
}
