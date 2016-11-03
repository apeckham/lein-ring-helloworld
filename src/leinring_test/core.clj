(ns leinring-test.core
  (:require [hiccup.core :refer :all]
            [hiccup.page :refer :all]
            [ring.middleware.resource :refer :all]
            [ring.middleware.content-type :refer :all]
            [ring.middleware.not-modified :refer :all])
  (:gen-class))

(defn hello-world [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html5
          [:head (include-css "/app.css")]
          [:h1 "Hello world" [:h2 "from leinring-test.core!"]])})

(def handler
  (-> hello-world
      (wrap-resource "public")
      (wrap-content-type)
      (wrap-not-modified)))