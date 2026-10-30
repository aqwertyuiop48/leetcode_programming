# 101 - 199
for spec in 101:E 138:E 150:D 154:E 160:E 163:D 163:E 164:E 177:F2 178:C3 185:C 186:E 195:E 198:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 200 - 249
for spec in 200:A 201:D 207:C3 207:D1 207:D10 207:D2 207:D4 207:D5 207:D6 207:D7 207:D8 207:D9 212:B 215:C 217:B 217:D 217:E 220:D 222:C 228:C 228:D 229:E 231:C 231:E 232:C 232:E 233:E 234:A 234:B 234:C 234:D 234:F 235:C 235:D 235:E 236:B 236:E 238:A 238:C 239:C 239:E 240:A 240:B 240:C 240:D 240:E 240:F 241:F 242:E 243:A 243:B 243:D 244:C 244:D 245:G 248:D 248:E 249:B 249:C; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 250 - 299
for spec in 251:E 253:A 253:B 253:C 253:D 253:E 254:A 254:B 254:C 254:D 254:E 255:E 256:C 256:D 256:E 257:D 257:E 258:E 261:D 261:E 263:E 264:C 264:D 264:E 265:E 266:E 269:C 269:D 269:E 270:E 272:E 273:C 273:D 274:E 279:A 279:D 280:E 282:B 283:E 286:B 286:C 286:D 286:E 287:D 287:E 291:E 292:B 292:C 292:D 293:B 293:E 295:A 295:B 296:B 296:C 296:D 297:B 297:C 297:D 298:D 298:E 299:B 299:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 300 - 335
for spec in 300:E 301:D 301:E 303:C 303:E 304:E 309:A 309:C 309:D 309:E 311:B 311:C 311:D 312:D 312:E 313:C 314:D 314:E 316:C2 316:E3 317:A 317:B 318:D 319:E 321:C 321:D 321:E 335:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

