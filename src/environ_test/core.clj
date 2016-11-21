(ns environ-test.core
  (:gen-class)
  (:require [environ.core :refer [env]]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (env :test-config)))
