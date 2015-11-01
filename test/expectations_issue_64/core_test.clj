(ns expectations-issue-64.core-test
  (:require [expectations :refer :all])
  (:import [java.util UUID]))

;(expect "Does generate error."
;  (UUID/fromString "2b606aa0-5528-11e5-b5cd-fe1373f6eebb_x"))

(expect-let [id (UUID/fromString "2b606aa0-5528-11e5-b5cd-fe1373f6eebb_x")]
  "Should generate error."
  id)

