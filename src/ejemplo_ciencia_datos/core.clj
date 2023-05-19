;; gorilla-repl.fileformat = 1

;; **
;;; # Ejemplo data science
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns ejemplo-data-science
  (:require [incanter.io :as io]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; **
;;; Abrimos el dataset de entrenamiento
;; **

;; @@
(def df (io/read-dataset "D:/Toni/Descargas/icr-identify-age-related-conditions/train.csv"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;ejemplo-data-science/df</span>","value":"#'ejemplo-data-science/df"}
;; <=

;; **
;;; Obtenemos las dimensiones del dataset
;; **

;; @@
(:shape df)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>618</span>","value":"618"},{"type":"html","content":"<span class='clj-unkown'>58</span>","value":"58"}],"value":"[618 58]"}
;; <=

;; @@

;; @@
