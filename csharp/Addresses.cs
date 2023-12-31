// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(AddressesJsonConverter))]
    public class Addresses
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<Address> Value { get; set; }
    }

    public class AddressesJsonConverter : JsonConverter<Addresses>
    {
        public override Addresses Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new Addresses { Value = JsonSerializer.Deserialize<IList<Address>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, Addresses value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<Address>>(writer, value.Value, options);
        }
    }
}
