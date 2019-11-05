mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 15
ldc i 0
str i 0 5
lod i 0 5
out i
ldc c '\n'
out c
ldc i 10
str i 0 6
lod i 0 6
out i
ldc c '\n'
out c
ldc i 0
str i 0 7
ldc i 20
str i 0 7
lod i 0 7
out i
ldc c '\n'
out c
ldc i 0
str i 0 8
ldc i 0
str i 0 9
ldc i 0
str i 0 10
lod i 0 8
out i
ldc c '\n'
out c
lod i 0 9
out i
ldc c '\n'
out c
lod i 0 10
out i
ldc c '\n'
out c
ldc b f
str b 0 11
ldc b t
str b 0 12
ldc b f
str b 0 13
ldc b f
str b 0 14
lod b 0 11
out b
ldc c '\n'
out c
lod b 0 12
out b
ldc c '\n'
out c
lod b 0 13
out b
ldc c '\n'
out c
lod b 0 14
out b
ldc c '\n'
out c
retp
