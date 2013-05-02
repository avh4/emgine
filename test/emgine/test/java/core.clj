(ns emgine.test.java.core
  (:use [emgine.java])
  (:use [emgine.test.helper])
  (:use [emgine.test.fixture.timer-model])
  (:use [clojure.test]))

(deftest simple-java-class
  (is (= (file-contents "emgine/test/java/TimerModel.java")
         (java timer-model))))
