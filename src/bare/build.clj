(ns bare.build
  (:require [figwheel.main.api :as fig]))

(defn -main [main]
  (fig/start {:id "dev"
              :options {:main main
                        :output-to "target/public/cljs-out/dev-main.js"}
              :config {:watch-dirs ["src"]}}))
