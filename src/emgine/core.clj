(ns emgine.core)

(defn java [name]
  (str "public class " name " {" \newline
       "}" \newline))

(defn objc [name]
  (str "@interface " name " : NSObject" \newline
       "@end" \newline
       \newline
       "@implementation " name \newline
       "@end" \newline))
