(ns emgine.objc)

(defn objc [name]
  (str "@interface " name " : NSObject" \newline
       "@end" \newline
       \newline
       "@implementation " name \newline
       "@end" \newline))