mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 7
ldc i 0
str i 0 5
ldc i 0
str i 0 5
loop0:
lod i 0 5
ldc i 10
les i
fjp loop1
lod i 0 5
ldc i 1
add i
str i 0 5
ujp loop0
loop1:
lod i 0 5
out i
ldc c '\n'
out c
ldc i 10
str i 0 5
loop2:
lod i 0 5
ldc i 0
grt i
fjp loop3
lod i 0 5
ldc i 1
add i
str i 0 6
lod i 0 6
out i
ldc c '\n'
out c
lod i 0 5
dpl i
ldc i 1
sub i
str i 0 5
ujp loop2
loop3:
retp
