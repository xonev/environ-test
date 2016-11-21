(defproject environ-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.1.0"]]
  :plugins [[lein-environ "1.1.0"]]
  :main ^:skip-aot environ-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :env {:test-config "Uberjar test config"}}
             :prod {:env {:test-config "Prod test config"}}
             :dev {:env {:test-config "Dev test config"}}
             :test {:env {:test-config "Test test config"}}})
