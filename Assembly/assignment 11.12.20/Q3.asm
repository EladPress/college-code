
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

data segment

arr DB 1 dup(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
var1 db 0


data ends

MOV CX, 0H

;START:
;INC VAR1
;LOOP START

ret
           



