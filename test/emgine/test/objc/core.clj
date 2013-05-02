(ns emgine.test.objc.core
  (:use [emgine.objc])
  (:use [emgine.test.helper])
  (:use [emgine.test.fixture.timer-model])
  (:use [clojure.test]))

(deftest simple-objc-class
  (is (= (file-contents "emgine/test/objc/TimerModel.m")
         (objc timer-model))))
