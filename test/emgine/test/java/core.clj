(ns emgine.test.java.core
  (:use [emgine.java])
  (:use [emgine.test.helper])
  (:use [emgine.test.fixture.timer-model])
  (:use [midje.sweet]))

(fact "about java renderer"
  (java timer-model) => (file-contents "emgine/test/java/TimerModel.java"))
