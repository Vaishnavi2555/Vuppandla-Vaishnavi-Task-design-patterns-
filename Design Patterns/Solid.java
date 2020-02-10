class Hp : Iprinter
{
public void Print(string PrintContent)
{
console.WriteLine("print done");
}
public void Scan(string ScanContent)
{
console.WriteLine("Scan content");
}
public void Fax(string FaxContent)
{
console.WriteLine("Fax content");
}
public void PrintDuplex(string PrintDuplexContent)
{
console.WriteLine("Print Duplex content");
}
}
