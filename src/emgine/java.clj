(ns emgine.java)

(defn java [name]
  (str "public class " name " {" \newline
       "}" \newline))