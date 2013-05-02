(defproject emgine "1.0.0-SNAPSHOT"
  :description "Multi-language code generation from clojure"
  :url "http://github.com/avh4/emgine"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {
             :dev {
                   :plugins [[lein-midje "3.0.0"]]
                   :dependencies [[midje "1.5.0"]]
                   }})
