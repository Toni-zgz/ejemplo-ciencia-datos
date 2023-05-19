(defproject ejemplo-ciencia-datos "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [incanter/incanter-core "1.9.3"]
                 [incanter/incanter-charts "1.9.3"]]
  :repl-options {:init-ns ejemplo-ciencia-datos.core}
  :plugins [[org.clojars.benfb/lein-gorilla "0.6.0"]])
