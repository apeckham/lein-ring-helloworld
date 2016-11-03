(ns leinring-test.core
  (:require [hiccup.core :refer :all]
            [hiccup.page :refer :all])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html5
            [:head]
            [:h1 "Hello world" [:h2 "from leinring-test.core!"]])})