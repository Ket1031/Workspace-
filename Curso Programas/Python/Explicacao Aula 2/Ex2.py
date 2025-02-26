#Recibo de compras


descriptionPc = "Azus gamer"
pricePc = 1000
descriptionMause = "cute"
priceMause = 300
descriptionKeyboard = "dark with led"
pricePcKeyboard = 150

iva = 0.23

totalPrice = pricePc + priceMause + pricePcKeyboard 
totalPriceWithIva = totalPrice * (1 + iva)

print(f"""
      Recibo de Compras
      -----------------
      
      Produtos:
      
      - Computador: {descriptionPc} - R$ {pricePc}
      - Mouse: {descriptionMause} - R$ {priceMause}
      - Teclado: {descriptionKeyboard} - R$ {pricePcKeyboard}
      
      Total: R$ {totalPrice}
      Total com IVA: R$ {totalPriceWithIva:.2f}
      
      """)