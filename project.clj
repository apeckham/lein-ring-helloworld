(defproject leinring-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot leinring-test.core
  :target-path "target/%s"
  :ring {:handler leinring-test.core/handler
         :auto-refresh? true}
  :plugins [[lein-ring "0.9.7"]]
  :profiles {:uberjar {:aot :all}})
