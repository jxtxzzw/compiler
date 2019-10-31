mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 7
ldc i 5
str i 0 5
ldc i 15
str i 0 6
lod i 0 5
out i
lod i 0 6
out i
retp
