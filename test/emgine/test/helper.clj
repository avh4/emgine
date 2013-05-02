(ns emgine.test.helper)

(defn file-contents [filename]
  (slurp (clojure.java.io/resource filename)))
