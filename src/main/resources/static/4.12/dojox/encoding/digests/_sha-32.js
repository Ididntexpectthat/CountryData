//>>built
define(["./_base"],function(x){function f(c,b){return c>>>b|c<<32-b}var m=function(c){var b=function(){};b.prototype=c;return new b}(x);m.toWord=function(c){for(var b=Array(c.length>>2),a=0;a<b.length;a++)b[a]=0;for(a=0;a<8*c.length;a+=8)b[a>>5]|=(c.charCodeAt(a/8)&255)<<24-a%32;return b};m.toHex=function(c){for(var b=[],a=0,d=4*c.length;a<d;a++)b.push("0123456789abcdef".charAt(c[a>>2]>>8*(3-a%4)+4&15),"0123456789abcdef".charAt(c[a>>2]>>8*(3-a%4)&15));return b.join("")};m.toBase64=function(c){for(var b=
[],a=0,d=4*c.length;a<d;a+=3)for(var f=(c[a>>2]>>8*(3-a%4)&255)<<16|(c[a+1>>2]>>8*(3-(a+1)%4)&255)<<8|c[a+2>>2]>>8*(3-(a+2)%4)&255,g=0;4>g;g++)8*a+6*g>32*c.length?b.push("\x3d"):b.push("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(f>>6*(3-g)&63));return b.join("")};m._toString=function(c){for(var b="",a=0;a<32*c.length;a+=8)b+=String.fromCharCode(c[a>>5]>>>24-a%32&255);return b};var d=x.addWords,y=[1116352408,1899447441,3049323471,3921009573,961987163,1508970993,2453635748,
2870763221,3624381080,310598401,607225278,1426881987,1925078388,2162078206,2614888103,3248222580,3835390401,4022224774,264347078,604807628,770255983,1249150122,1555081692,1996064986,2554220882,2821834349,2952996808,3210313671,3336571891,3584528711,113926993,338241895,666307205,773529912,1294757372,1396182291,1695183700,1986661051,2177026350,2456956037,2730485921,2820302411,3259730800,3345764771,3516065817,3600352804,4094571909,275423344,430227734,506948616,659060556,883997877,958139571,1322822218,
1537002063,1747873779,1955562222,2024104815,2227730452,2361852424,2428436474,2756734187,3204031479,3329325298];m.digest=function(c,b,a,m){a=a.slice(0);var n=Array(64),g,q,v,p,t,u,k,w,e,h,l;c[b>>5]|=128<<24-b%32;c[(b+64>>9<<4)+15]=b;for(w=0;w<c.length;w+=16){b=a[0];g=a[1];q=a[2];v=a[3];p=a[4];t=a[5];u=a[6];k=a[7];for(e=0;64>e;e++){if(16>e)n[e]=c[e+w];else{h=e;l=n[e-2];l=f(l,17)^f(l,19)^l>>>10;l=d(l,n[e-7]);var r;r=n[e-15];r=f(r,7)^f(r,18)^r>>>3;n[h]=d(d(l,r),n[e-16])}h=p;h=f(h,6)^f(h,11)^f(h,25);h=
d(d(d(d(k,h),p&t^~p&u),y[e]),n[e]);k=b;k=f(k,2)^f(k,13)^f(k,22);l=d(k,b&g^b&q^g&q);k=u;u=t;t=p;p=d(v,h);v=q;q=g;g=b;b=d(h,l)}a[0]=d(b,a[0]);a[1]=d(g,a[1]);a[2]=d(q,a[2]);a[3]=d(v,a[3]);a[4]=d(p,a[4]);a[5]=d(t,a[5]);a[6]=d(u,a[6]);a[7]=d(k,a[7])}224==m&&a.pop();return a};return m});