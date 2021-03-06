# Exercises Set 3

## 1: Find the value of the Boolean expression `L(x,y,z) = x'(y + z) + xy'z` if:

1. `(x,y,z) = (1,1,0)`
	- `1' • (1 + 0) + 1 • 1' • 0`
	- `1 + 0 + 0`
		- `L(x,y,z) = 0`
2. `(x,y,z) = (0,1,0)`
	- `0' • (1 + 0) + 0 • 1' • 0`
	- `1 • 1 + 1 • 0 + 0 • 0 • 0`
	- `1 + 0 + 0`
		- `L(x,y,z) = 1`
3. `(x,y,z) = (0,0,1)`
	- `0' • (0 + 1) + 0 • 0' • 1`
	- `1 • 0 + 1 • 1 + 0 • 1 • 1`
	- `0 + 1 + 1`
		- `L(x,y,z) = 1`

## 2: Find the value of the Boolean expression `M(x,y,z) = xy' + y(z' + xy')` if:

1. `(x,y,z) = (0,0,0)`
	- `0 • 0' + 0 • (0' + 0 • 0')`
	- `0 • 1 + 0 • (1 + 0 • 1)`
	- `0 + 0 • 1`
	- `0 + 0`
		- `M(x,y,z) = 0`
2. `(x,y,z) = (0,1,0)`
	- `0 • 1' + 1 • (0' + 0 • 1')`
	- `0 • 0 + 1 • (1 + 0 • 0)`
	- `0 + 1 • 1`
	- `0 • 1`
		- `M(x,y,z) = 1`
3. `(x,y,z) = (1,0,1)`
	- `1 • 0' + 0 • (1' + 1 • 0')`
	- `1 • 1 + 0 • (0 + 1 • 1)`
	- `1 + 0 • 1`
	- `1 + 1`
		- `M(x,y,z) = 1`

## 3: Construct a truth table for `G(x,y,z) = x'y + xy'z`

| `x` | `y` | `z` | `x'y` | `xy'z` | `G` |
|:---:|:---:|:---:|:-----:|:------:|:---:|
| 0   | 0   | 0   | 0     | 0      | 0   |
| 0   | 0   | 1   | 0     | 0      | 0   |
| 0   | 1   | 0   | 1     | 0      | 1   |
| 0   | 1   | 1   | 1     | 0      | 1   |
| 1   | 0   | 0   | 0     | 0      | 0   |
| 1   | 0   | 1   | 0     | 1      | 1   |
| 1   | 1   | 0   | 0     | 0      | 0   |
| 1   | 1   | 1   | 0     | 0      | 0   |

## 4: Construct a truth table for `F(x,y,z) = xyz + xy'z'`

| `x` | `y` | `z` | `xyz` | `xy'z'` | `F` |
|:---:|:---:|:---:|:-----:|:-------:|:---:|
| 0   | 0   | 0   | 0     | 0       | 0   |
| 0   | 0   | 1   | 0     | 0       | 0   |
| 0   | 1   | 0   | 0     | 0       | 0   |
| 0   | 1   | 1   | 0     | 0       | 0   |
| 1   | 0   | 0   | 0     | 1       | 1   |
| 1   | 0   | 1   | 0     | 0       | 0   |
| 1   | 1   | 0   | 0     | 0       | 0   |
| 1   | 1   | 1   | 1     | 0       | 1   |

## 5: Construct a truth table for `P(x,y,z) = yz' + x'yz + xz'`

| `x` | `y` | `z` | `yz'` | `x'yz` | `xz'` | `P` |
|:---:|:---:|:---:|:-----:|:------:|:-----:|:---:|
| 0   | 0   | 0   | 0     | 0      | 0     | 0   |
| 0   | 0   | 1   | 0     | 0      | 0     | 0   |
| 0   | 1   | 0   | 1     | 0      | 0     | 1   |
| 0   | 1   | 1   | 0     | 1      | 0     | 1   |
| 1   | 0   | 0   | 0     | 0      | 1     | 1   |
| 1   | 0   | 1   | 0     | 0      | 0     | 0   |
| 1   | 1   | 0   | 1     | 0      | 1     | 1   |
| 1   | 1   | 1   | 0     | 0      | 0     | 0   |

## 6: Construct a truth table for `Q(x,y,z) = x'y + x'z + y'z'`

| `x` | `y` | `z` | `x'y` | `x'z` | `y'z'` | `Q` |
|:---:|:---:|:---:|:-----:|:-----:|:------:|:---:|
| 0   | 0   | 0   | 0     | 0     | 1      | 1   |
| 0   | 0   | 1   | 0     | 1     | 0      | 1   |
| 0   | 1   | 0   | 1     | 0     | 0      | 1   |
| 0   | 1   | 1   | 1     | 1     | 0      | 1   |
| 1   | 0   | 0   | 0     | 0     | 1      | 1   |
| 1   | 0   | 1   | 0     | 0     | 0      | 0   |
| 1   | 1   | 0   | 0     | 0     | 0      | 0   |
| 1   | 1   | 1   | 0     | 0     | 0      | 0   |

## 7: Construct a truth table for `H(x,y,z) = x'yz + xyz'`

| `x` | `y` | `z` | `x'yz` | `xyz'` | `H` |
|:---:|:---:|:---:|:------:|:------:|:---:|
| 0   | 0   | 0   | 0      | 0      | 0   |
| 0   | 0   | 1   | 0      | 0      | 0   |
| 0   | 1   | 0   | 0      | 0      | 0   |
| 0   | 1   | 1   | 1      | 0      | 1   |
| 1   | 0   | 0   | 0      | 0      | 0   |
| 1   | 0   | 1   | 0      | 0      | 0   |
| 1   | 1   | 0   | 0      | 1      | 1   |
| 1   | 1   | 1   | 0      | 0      | 0   |

## 8: Draw a logic circuit for the expression `xy' + x'yz`

![gate labex8](http://i.imgur.com/iBUCSv2.png)

## 9: Draw a logic circuit for the expression `(x' + z)(y + z')`

![gate labex9](http://i.imgur.com/23DzBnP.png)

## 10: Draw a logic circuit for the expression `y(x' + y'z)`

![gate labex10](http://i.imgur.com/bNUNfGx.png)

## 11: Find a Boolean expression for the following logic circuit

![gate labex11](http://i.imgur.com/WTOCkTk.png)

`(x'y + xy')z'`

## 12: Find a Boolean expression for the following logic circuit

![gate labex12](http://i.imgur.com/uElO9bM.png)

`(y' + z')(x + y)`

## 13: Find a Boolean expression for the following logic circuit

![gate labex13](http://i.imgur.com/M3c9gKJ.png)

`x'y + xy'z + y'z'`

## 14: Simplify each of the following expressions to a sum of products using the laws of Boolean algebra

- A: `(x + y)z' + y(x' + z')`
	- `xz' + yz' + x'y`
- B: `x'yz + x(x' + yz') + x'y'z`
	- `x'yz + xyz' + x'y'z`
- C: `x'(z + yz') + y'z`
	- `x'z + x'yz' + y'z`
- D: `xz + z'(xz + y')`
	- `xz + z'y`
- E: `x'z(xy + y'z' + yz)`
	- `x'yz`
- F: `(yz' + x'z)'`
	- `xy' + xz + y'z`
- G: `(x' + y'z + xz')'`
	- `xyz`
- H: `(y + xy'z)'`
	- `x'y + y'z'`
- I: `x'(x + y'z) + (y' + z)'`
	- `x'y'z + yz'`
- J: `y'(xz' + y'z)'`
	- `x'y'z'`
- K: `(x'y + xz')(y' + x'z)`
	- `x'yz + xy'z'`
- L: `(wx' + yz')'`
	- `w'y + w'z + xy' + xz`
- M: `wx'y(xy + w'yz + wyz)`
	- `wx'yz`
- N: `(xy + x'y'z)'`
	- `x'y + x'z' + xy' + y'z'`
- O: `(x + yz)' + y'(xy + z)`
	- `x'y' + x'z' + y'z`
- P: `(xyz' + x'y' + z)'`
	- `x'yz' + xy'z'`
- Q: `(xy' + yz')'`
	- `x'y' + x'z + yz`
- R: `(y + z')'(x' + y)'`
	- `xy'z` **had trouble with this**

## 15: The truth tables for Boolean functions `M` `F` `G` `H` `P` `Q` and `R` are shown below. Express each as a complete sum of products.

| `x` | `y` | `z` | `M` | `F` | `G` | `H` | `P` | `Q` | `R` |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| 0   | 0   | 0   | 1   | 0   | 1   | 0   | 1   | 0   | 0   |
| 0   | 0   | 1   | 0   | 1   | 0   | 1   | 0   | 1   | 1   |
| 0   | 1   | 0   | 1   | 1   | 0   | 1   | 1   | 0   | 1   |
| 0   | 1   | 1   | 0   | 0   | 1   | 0   | 0   | 1   | 0   |
| 1   | 0   | 0   | 0   | 1   | 0   | 1   | 0   | 1   | 1   |
| 1   | 0   | 1   | 1   | 0   | 0   | 1   | 1   | 0   | 1   |
| 1   | 1   | 0   | 0   | 1   | 1   | 0   | 0   | 1   | 1   |
| 1   | 1   | 1   | 1   | 0   | 0   | 1   | 0   | 0   | 0   |

- `M = x'y'z' + x'yz' + xy'z + xyz`
- `F = x'y'z + x'yz' + xy'z' + xy'z`
- `G = x'y'z' + x'yz + xyz'`
- `H = xyz' + x'yz' + xy'z' + xy'z + xyz`
- `P = x'y'z' + x'yz' + xy'z`
- `Q = x'y'z + x'yz + xy'z' + xyz'`
- `R = x'y'z + x'yz' + xy'z' + xy'z + xyz'`

## 16: Expand each of the following Boolean expressions into a complete sum of products

1. `L(x, y) = x + y'`
	- `L(x, y) = x + y' = xy + x'y + x'y'`
2. `M(x, y, z) = xy' + yz'`
	- `M(x, y, z) = xy' + yz' = xy'z + xy'z' + xyz' + x'yz'`
3. `P(x, y, z) = x'y + yz`
	- `P(x, y, z) = x'y + yz = x'yz + x'yz' + xyz`
4. `Q(x, y, z) = yz' + z`
	- `Q(x, y, z) = yz' + z = xyz' + x'yz' + xyz + xy'z + x'yz + x'y'z`
5. `L(w, x, y) = wxy + wy'`
	- `L(w, x, y) = wxy + wy' = wxy + wxy' + wx'y'`
6. `M(w, x, y, z) = xy'z + wx'y`
	- `M(w, x, y, z) = xy'z + wx'y = wxy'z + w'xy'z + wx'yz + wx'yz'`
7. `P(w, x, y, z) = xz' + wy`
	- `P(w, x, y, z) = xz' + wy = wxyz' + wxy'z' + w'xyz' + w'xy'z' + wxyz + wx'yz + wx'yz'`
8. `Q(w, x, y, z) = wxy + wyz`
	- `Q(w, x, y, z) = wxy + wyz = wxyz + wxyz' + wx'yz`
