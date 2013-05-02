(ns emgine.test.core
  (:use [emgine.core])
  (:use [clojure.test]))

(def timer-model "TimerModel")

(deftest simple-java-class
  (is (=
"public class TimerModel {
}
"
      (java timer-model))))

(deftest simple-objc-class
  (is (=
"@interface TimerModel : NSObject
@end

@implementation TimerModel
@end
"
        (objc timer-model))))
