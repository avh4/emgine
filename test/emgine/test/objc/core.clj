(ns emgine.test.objc.core
  (:use [emgine.objc])
  (:use [emgine.test.helper])
  (:use [emgine.test.fixture.timer-model])
  (:use [midje.sweet]))

(fact "about objective-c renderer"
  (objc timer-model) => (file-contents "emgine/test/objc/TimerModel.m"))
