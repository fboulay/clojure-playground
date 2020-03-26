(defproject repl-playground "0.1.0-SNAPSHOT"
  :description "REPL Playground"
  :url "http://example.com/FIXME"
  :license {:name "Apache License, Version 2.0"
            :url  "https://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot repl-playground.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
