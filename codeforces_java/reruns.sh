# 101 - 199
for spec in 138:E 150:D 163:E 164:E 171:D 171:E 178:C3 178:E1 178:E2 178:E3 185:C 186:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 200 - 249
for spec in 201:D 207:A1 207:A2 207:A3 207:B1 207:B2 207:B3 207:C1 207:C2 207:C3 207:D1 207:D2 207:D3 207:D4 207:D5 207:D6 207:D7 207:D8 207:D9 207:D10 225:B 240:F 241:F 241:G 242:E 243:A 243:B 243:D 244:C 244:D 245:G 248:D 248:E 249:B 249:C; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 250 - 299
for spec in 250:C 250:D 250:E 251:E 253:A 253:B 253:C 253:D 253:E 254:A 254:B 254:C 254:D 254:E 255:E 256:C 256:D 256:E 257:D 257:E 258:E 261:D 261:E 263:E 264:C 264:D 264:E 265:E 266:E 269:C 269:D 269:E 270:E 272:E 273:C 273:D 274:E 279:A 279:D 280:E 282:B 283:E 286:B 286:C 286:D 286:E 287:D 287:E 291:E 292:B 292:C 292:D 293:B 293:E 295:A 295:B 296:B 296:C 296:D 297:B 297:C 297:D 298:D 298:E 299:B; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 300 - 335
for spec in 299:D 300:E 301:D 301:E 303:C 303:E 304:E 309:A 309:C 309:D 309:E 311:B 311:C 311:D 312:D 312:E 313:C 314:D 314:E 316:C2 316:E3 316:F1 316:F2 316:F3 317:A 317:B 318:D 319:E 321:C 321:D 321:E 322:B 323:A 323:B 323:C 325:A 325:B 325:C 325:D 325:E 327:A 327:B 327:C 327:D 327:E 328:A 328:B 329:A 329:B 329:C 329:D 329:E 330:A 330:B 331:A1 331:A2 331:B1 331:B2 331:C1 331:C2 331:C3 331:D1 331:D2 331:D3 331:E1 331:E2 332:A 332:B 332:C 332:D 332:E 333:D 333:E 334:A 335:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 336 - 376
for spec in 336:B 336:E 337:E 338:C 339:E 340:B 341:D 345:A 345:B 345:C 345:D 345:E 345:F 345:G 346:C 347:E 348:C 348:E 350:D 350:E 353:D 356:B 360:C 361:B 361:E 364:D 364:E 369:D 369:E 370:E 372:C 372:D 373:E 374:C 374:D 374:E 375:B 375:D 375:E 376:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
