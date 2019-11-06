mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 8
ldc i 1
str i 0 5
in i
str i 0 5
lod i 0 5
out i
ldc b f
str b 0 6
in b
str b 0 6
lod b 0 6
out b
ldc r 1.1
str r 0 7
in r
str r 0 7
lod r 0 7
out r
retp
