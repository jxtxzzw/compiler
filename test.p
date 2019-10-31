mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 11
ldc i 1
ldc i 2
add i
ldc i 3
add i
str i 0 5
lod i 0 5
str i 0 6
lod i 0 5
ldc i 4
sub i
str i 0 7
lod i 0 7
out i
lod i 0 5
out i
lod i 0 6
out i
ldc i 123
str i 0 5
ldc i 456
str i 0 6
lod i 0 5
lod i 0 6
add i
str i 0 7
lod i 0 7
out i
retp
